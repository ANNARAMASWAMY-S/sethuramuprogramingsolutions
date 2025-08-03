import './App.css';
import CurrencyConverter from './CurrencyConverter';
import { useState } from 'react';
function App() {
  const [counter,setCounter]=useState(0);
  const inc = () =>{
    setCounter(counter+1);
    alert("Hello! Member!")
  }


  const dec = () =>{
    if(counter>0)
    {
      setCounter(counter-1);
    }
  }


  const saywelcome =()=>{
    alert("welcome");
  }


  const sayhello=()=>{
    alert("I was clicked");
  }
  return (
    <>
    <h4>{counter}</h4>
    <button onClick={()=>inc()}>Increment</button>
    <br></br>
    <button onClick={()=>dec()}>Decrement</button>
    <br></br>
    <button onClick={()=>saywelcome()}>Say welcome</button>
    <br></br>
    <button onClick={()=>sayhello()}>Click on me</button>
    <br></br>
    <br></br>
    <br></br>
    <br></br>
    <CurrencyConverter />
    </>
  );
}

export default App;
