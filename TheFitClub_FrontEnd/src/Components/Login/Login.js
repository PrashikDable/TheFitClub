import React from 'react';
import './Login.css'; 
import loginimage from "../../assets/login.jpg"
import { Link } from 'react-router-dom';

function Login() {

  var username=''
  var password=''

  function userNameHandler(e){
    username = e.target.value
    console.log(username)
  }

  function passwordhandler(e){
    password=e.target.value
    console.log(password)
  }

  function loginhandler(){
    const body={
       username,
       password,
    }
    console.log(username , password)
    // axios.post(`${URL}/User/login`,body).then((response)=>{
    //      console.log("sucessfull login");
    // })
}

  return (
    <div className="login-container">
      
        {/* <Link to={"/"} style={{textAlign:"right",textDecoration:"none"}}>back</Link> */}
      
      <div className="login-form">
        <h2 className="login-heading">Sign in</h2>
        <div className="form-group">
          {/* <label className='login-lb' htmlFor="email">Email</label> */}
          <b>UserName: </b><input type="email" id="email" className="form-control" onBlur={userNameHandler}/>
        </div>
        <div className="form-group">
          {/* <label className='login-lb' htmlFor="password">Password</label> */}
         <b> Password: </b><input type="password" id="password" className="form-control" onBlur={passwordhandler}/>
        </div>
        
        <button className="btn btn-primary btn-block" onClick={loginhandler}>Log In</button>
        <Link to="/register" className="text-center">Create new account</Link>
      </div>
      <div className="login-image">
        <img src={loginimage} alt="Login" className="rounded" />
      </div>

    </div>
  );
}

export default Login;