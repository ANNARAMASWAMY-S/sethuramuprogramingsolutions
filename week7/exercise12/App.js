import './App.css';
import { useState } from 'react';
import UserGreeting from './UserGreeting';
import GuestGreeting from './GuestGreeting';

function App() {
  const[loggedin,setLoggedin]=useState(false);
  const chk = () =>{
    if(loggedin)
    {
      setLoggedin(false);
    }
    else{
    setLoggedin(true);
    }
  }
  return (
    <>
    {loggedin?<UserGreeting />:<GuestGreeting />}
    {loggedin?<button onClick={()=>chk()}>Logout</button>:<button onClick={()=>chk()}>Login</button>}
    </>
  );
}

export default App;
