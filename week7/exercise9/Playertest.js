import React from "react";

import { useState , useEffect } from "react";

function Playertest(){
    const players=['Sachin1','Dhoni2','Virat3','Rohit4','Yuvaraj5','Raina6'];

    const odd1=[];



    const even1=[];

    const [oddplay,setOddplay]=useState([]);

    const [evenplay,setEvenplay]=useState([]);


    const[testingplayers,setTestingplayers]=useState([]);

    const T20Playes=['First Player','Second Player','Third Player'];
    const RanjiTrophyPlayers=['Fourth Player','Fifth Player','Sixth Player'];
    const IndianPlayers=[...T20Playes,...RanjiTrophyPlayers];

    const odd = ([first,,third,,fifth]) =>{
        setOddplay([first,third,fifth]);
    }

    const even =([,second,,fourth,,sixth])=>{
        setEvenplay([second,fourth,sixth]);
    }
    useEffect(()=>{
        odd(players);
        even(players);
        setTestingplayers([...odd1,...even1]);
    },[])
    return(
        <>
            <h1>Odd players</h1>
            {
                oddplay.map((data)=>{
                    return(
                        <li>Mr.{data}</li>
                    )
                })
            }
            
            <h1>Even Players</h1>
             {
                evenplay.map((data)=>{
                    return(
                        <li>Mr.{data}</li>
                    )
                })
            }
            <h1>List of Indian Players merged</h1>
            {IndianPlayers.map((data)=>{
                return(
                    <li>Mr.{data}</li>
                )
            })}
        </>
    );
}


export default Playertest;
