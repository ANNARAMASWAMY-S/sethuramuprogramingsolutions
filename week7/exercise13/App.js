import './App.css';
import BlogDetails from './BlogDetails';
import BookDetails from './BookDetails';
import CourseDetails from './CourseDetails';

function App() {
  const books=[{"id":1,"name":"Master React","price":670},{"id":2,"name":"Dive deep into Angular 11","price":800},{"id":3,"name":"Mongo Essentials","price":450}]
  const courses=[{"id":1,"name":"Angular","date":"4/5/20221"},{"id":2,"name":"React","date":"6/3/2021"}];
  const blogs=[{"id":1,"name":"React Learning","author":"Stephen Biz","description":"welcome to learning react!"},{"id":2,"name":"Installation","author":"schewzdenier","description":"You can install react from npm"}];
  return (
     <>
     <div id="coursedetails">
        <h1>CourseDetails</h1>
        {courses.map((data)=>{
            return(
                <>
                <h1>{data.name}</h1>
                <h6>{data.date}</h6>
                </>
            );
        })}
        </div>
        <div id="container1"></div>
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
        <div id='container2'></div>
        <div id="blogdetails">
            <h1>BlogDetails</h1>
            {blogs.map((data)=>{
                return(
                    <>
                    <h1>{data.name}</h1>
                    <h5>{data.author}</h5>
                    <h5>{data.description}</h5>
                    </>
                );
            })}
        </div>
        </>
  );
}

export default App;
