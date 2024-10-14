import './App.css';
import { useState } from 'react';
import HerbList from './components/HerbList';
import HerbInput from './components/HerbInput';
import { Button } from '@mui/material';
import axios from 'axios';

function App() {

  const [userLocation, setUserLocation] = useState(null);

  const [isAdding, setIsAdding] = useState(false);

  const [herbData, setHerbData] = useState(null);

  function getDataFromDB(){
    axios.get('http://localhost:8080/api/herbsightings/')
    .then(res => {
        const dbData = res.data;
        setHerbData(dbData);
      })
  }

  const getCurrentLocation = () => {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(
        (position) => {
          const { latitude, longitude } = position.coords;
          setUserLocation({ latitude, longitude });
        },

        (error) => {
          console.error('There was an error getting your location:', error);
        }
      );
    }

    else {
      console.error('Location is not supported.');
    }
    getDataFromDB();
  };

  function handleInputClick(){
    if (!userLocation){
      getCurrentLocation();

    }
    setIsAdding(true);
  }

  function handleNewSighting(userInputs){
    axios({
      method: 'post',
      headers: { 'Content-Type': 'application/json' },
      url: 'http://localhost:8080/api/herbsightings/',
      data: userInputs
    }).then(function (response) {
      getDataFromDB();
    }).catch((error) => {
      if (error.response) {
      } else if (error.request) {

          console.log(error.request);
      } else {
          console.log('Error', error.message);
      }
      console.log(error.config);
  });
    setIsAdding(false);
  }

  return (
    <>
    {userLocation && <Button onClick={handleInputClick}>Add A New Herb Sighting</Button>}
    {isAdding && <HerbInput userLoc={userLocation} herbData={herbData} stateFunction={handleNewSighting}/>}
    <Button onClick={getCurrentLocation}>See Nearby Herb Sightings</Button>
    {userLocation && !isAdding && herbData && <HerbList herbData={herbData}/>}
    </>
  );
}

export default App;
