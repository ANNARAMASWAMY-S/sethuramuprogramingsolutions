import React from 'react'




const players=[{"name":"Jack","score":50},{"name":"Michael","score":70},{"name":"John","score":40}
    ,{"name":"Ann","score":61},{"name":"Elisabeth","score":61},{"name":"Sachin","score":95}
    ,{"name":"Dhoni","score":100},{"name":"Virat","score":84},{"name":"Jadeja","score":64},
    {"name":"Raina","score":75},{"name":"Rohit","score":80}
]



function Player(){
    return(
        <>
            <h1>List of PLayers</h1>
            {players.map((data)=>{
                return(
                        <li>Mr.{data.name}{' '}{data.score}</li>
            )})}


            <h1>List of players having score less than 70</h1>

            {players.map((data)=>{
                if(data.score<=70){
                return(
                        <li>Mr.{data.name}{' '}{data.score}</li>
            )}
            else{
                return(<></>)
            }})}
        </>
    )
}


export default Player;
