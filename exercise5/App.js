import './App.css';
import { useEffect} from 'react';
function App() {



  

  const colors =() =>{
    let title1=(document.getElementById("title1"));
    let status1=document.getElementById("status1").innerText;
    if(status1==="Ongoing")
    {
      title1.style.color="green";
    }
    else{
      title1.style.color="blue";
    }

    let title2=(document.getElementById("title2"));
    let status2=document.getElementById("status2").innerText;
    if(status2==="Ongoing")
    {
      title2.style.color="green";
    }
    else{
      title2.style.color="blue";
    }




     let title3=(document.getElementById("title3"));
    let status3=document.getElementById("status3").innerText;
    if(status3==="Ongoing")
    {
      title3.style.color="green";
    }
    else{
      title3.style.color="blue";
    }

  }


  useEffect(()=>{
    colors();
  },[]);

  
  return (
   <>
   <div class="box1">
    <h1>Cohort Details</h1>
    <div class="box">
      <h3 id="title1">INTADMDF10 - .NET FSD</h3>
      <h5 id="h5">Started On</h5>
      <dt id="date1">22-Feb-2022</dt>
      <h4 id="cs">Current Status</h4>
      <h3 id="status1">Scheduled</h3>
      <h4 id="c">Coach</h4>
      <h3 id="coach1">Aathma</h3>
      <h4 id="t">Trainer</h4>
      <h3 id="trainer1">Jojo Jose</h3>
    </div>
    <div class="box">
      <h3 id="title2">ADM21JF014 -Java FSD</h3>
      <h5 id="h5">Started On</h5>
       <dt id="date2">10-Sep-2021</dt>
      <h4 id="cs">Current Status</h4>
       <h3 id="status2">Ongoing</h3>
      <h4 id="c">Coach</h4>
      <h3 id="coach2">Apoorv</h3>
      <h4 id="t">Trainer</h4>
      <h3 id="trainer2">Elisa Smith</h3>
    </div>
    <div class="box">
      <h3 id="title3">CDBJF21025 - Java FSD</h3>
      <h5 id="h5">Started On</h5>
      <dt id="date3">24-Dec-2021</dt>
      <h4 id="cs">Current Status</h4>
      <h3 id="status3">Ongoing</h3>
      <h4 id="c">Coach</h4>
      <h3 id="coach3">Aathma</h3>
      <h4 id="t">Trainer</h4>
      <h3 id="trainer3">John Doe</h3>
    </div>
   </div>
   </>
  );
}

export default App;
