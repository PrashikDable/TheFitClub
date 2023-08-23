import React from 'react'
import {Link} from "react-router-dom"

const UserProfile = () => {
  return (
    <div className="dashboard">
       <h2>Profile</h2>
    
    <div className="section"></div>

    <div className="section">
      {/* <button className="button">Exercise</button> */}
      <Link to={'/exercise'} className='link-button'>Exercise</Link>
    </div>
    
    <div className="section">
      {/* <button className="button">Track Progress</button> */}
      <Link to={'/exercise'} className='link-button'>Tack Progress</Link>
    </div>
    
    <div className="section">
      {/* <button className="button">Nutrition</button> */}
      <Link to={'/exercise'} className='link-button'>Nutrition</Link>
    </div>
    
    <div className="section">
      {/* <button className="button">View Trainer</button> */}
      <Link to={'/exercise'} className='link-button'>View Trainer</Link>
    </div>
    
    <div className="section">
      {/* <button className="button">History</button> */}
      <Link to={'/exercise'} className='link-button'>History</Link>
    </div>
  </div>
  )
}

export default UserProfile
