import './App.css';
import Player from './Player';
import { useState } from 'react';
import Playertest from './Playerstest';

function App() {
  const[flag,setFlag]=useState(true);
  const test = () => {
      if(flag===false)
      {
        setFlag(true);
      }
      else{
        setFlag(false);
      }
  }
  return(
    <>
      {flag===true?<Player />:<Playertest />}
      <br></br>
      <button onClick={()=>test()}>Flag</button>
    </>
  )
}

export default App;
