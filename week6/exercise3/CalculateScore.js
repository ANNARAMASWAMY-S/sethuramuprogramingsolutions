import React from 'react';
import './mystyle.css';
const  percentToDecimal = (decimal)=>{
    return(decimal.toFixed(2)+'%');
}



const calcScore=(total,goal)=>{
    return(percentToDecimal(total/goal));
}

function CalculateScore({Name,School,Total,Goal}){
    return(<>
    <h1 id='studentdetails'>Student Details:</h1>
    <h3 id='name'>Name:<span>{Name}</span></h3>
    <h3 id='school'>School:<span>{School}</span></h3>
    <h3 id='total'>Total:<span>{Total} Marks</span></h3>
    <h3 id='score'>Score:<span>{calcScore(Total,Goal)}</span></h3>
    </>);
}


export default CalculateScore;
