import { Route,Routes } from 'react-router-dom';

import Home from './Components/Home/Home';
import Login from './Components/Login/Login'
import Registration from './Components/Registration/Registration';
import Exercise from './Components/Exercise/Exercise';

function App() {
  return <Routes>
    <Route path='/' element={<Home/>}></Route>
    
    <Route path='/login' element={<Login/>}/>
    <Route path='/Register' element={<Registration/>}/>
    <Route path='/exercise' element={<Exercise/>}/>

    </Routes>
}


export default App;
