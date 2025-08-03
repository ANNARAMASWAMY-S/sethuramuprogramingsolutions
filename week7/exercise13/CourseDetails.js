import React from "react";

import './App.css';

function CourseDetails(){
    return(
        <><div id="coursedetails">
        <h1>CourseDetails</h1>
        {courses.map((data)=>{
            return(
                <>
                <h1>{data.name}</h1>
                <h6>{data.date}</h6>
                </>
            );
        })}
        </div></>
    );
}


export default CourseDetails;
