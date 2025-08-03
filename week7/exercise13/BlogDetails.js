import React from "react";

import './App.css';

function BlogDetails(){
    return(
        <>
        <div id="blogdetails">
            <h1>BlogDetails</h1>
            {blogs.map((data)=>{
                return(
                    <>
                    <h1>{data.name}</h1>
                    <h5>{data.author}</h5>
                    <h5>{data.description}</h5>
                    </>
                );
            })}
        </div>
        </>
    );
}


export default BlogDetails;
