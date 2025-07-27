import React from "react";


class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state={
            list:[]
        };
    }
    render(){
        return(
            <>
                {this.state.list.map((data)=>{
                    return(
                        <>
                        <ul key={data.id}>
                        <li>{data.id}</li>
                        <li>{data.title}</li>
                        <li>{data.body}</li>
                        </ul>
                        </>


                    );
                })}
        </>
        );
    }
    componentDidMount(){
       this.loadposts();
    }
    async loadposts(){
        const response= await fetch("https://jsonplaceholder.typicode.com/posts").then((res)=>res.json());
       let demo=[];
       demo=[...response];
       this.setState({list:demo})
    }
    componentDidCatch(error,info)
    {
        console.log(error);
    };
    
}


export default Posts;
