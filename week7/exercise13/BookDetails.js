import React from "react";

import './App.css';

function BookDetails(){
  return(
        <>
         <div id="bookdetails">
           <h1>BookDetails</h1>
        {books.map((data)=>{
            return(
                <>
                <h4>{data.name}</h4>
                <h6>{data.price}</h6>
                </>
            )
        })}
        </div>
        </>
      
    );
}


export default BookDetails;
