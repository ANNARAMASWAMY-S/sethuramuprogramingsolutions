import './App.css';
import { useEffect, useState } from 'react';
import data from './Demofile';
function App() {
  const element="Office Space";
  const item={"itemname":"DBS","rent":50000,"address":"chennai"}
  const [colors1,setColors]=useState([]);
  const sr=data;
  useEffect(()=>{
    let colors=[];
    if(item.rent<=60000)
    {
      colors.push("red");
      setColors(colors);
    }
    else{
      colors.push("green");
      setColors(colors);
    }
  },[item.rent])
  return (
   <>
   <h1>{element}, at Affordable Range</h1>
   <img src={sr} alt="office space"/>
   <h1>Name:{item.itemname}</h1>
   <h3 style={{color:colors1[0]}}>Rent:Rs.{item.rent}</h3>
   <h3>Address:{item.address}</h3>
   </>
  );
}

export default App;
