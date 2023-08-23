import React from 'react';
import "./Trainer.css"

const Trainer = () => {
  return (
    <div className="dashboard">
      <h2>Trainer's Dashboard</h2>
      
      <div className="section">
    
      </div>
      
      <div className="section">
        
        <button className="button">Client Assessment</button>
      </div>
      
      {/* <div className="section">
        
        <button className="button">Set Goals</button>
      </div> */}
      
      <div className="section">
       
        <button className="button">Track Progress</button>
      </div>
      
      <div className="section">
       
        <button className="button">Create Exercise Plan</button>
      </div>
      
      <div className="section">
 
        <button className="button">Create Nutrition Plan</button>
      </div>
      
      <div className="section">
        
        <button className="button">View Client History</button>
      </div>
    </div>
  );
}

export default Trainer;