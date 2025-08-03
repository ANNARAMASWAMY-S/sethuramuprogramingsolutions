import React, { useState } from "react";


function CurrencyConverter(){
    const [text,setText]=useState(0);
    const[text1,seTextone]=useState('');
    const convertortest = (event) =>{
        event.preventDefault();
        alert(`Converting to ${text1} Amount is : ${text*80}` )
    }
    return(
        <>
        <form  onSubmit={convertortest} >
        <h1 style={{color:"green"}}>Currency Convertor!!!</h1>
    <h3>Amount  : <span><input type='number' value={text} onChange={(e)=>setText(e.target.value)}></input></span></h3>
    <h3>Currency : <span><textarea value={text1} onChange={(e)=>seTextone(e.target.value)}></textarea></span></h3>
    <button style={{marginLeft:"130px"}} type="submit">Submit</button>
    </form>
        </>
    );
}


export default CurrencyConverter;
