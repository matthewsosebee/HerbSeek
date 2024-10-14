import { APIProvider, Map, AdvancedMarker } from '@vis.gl/react-google-maps';
import { getGoogleMapsAPIKey, getGoogleMapsMapId } from '../utils/UtilsFuctions.js';
import { Autocomplete, TextField, Button } from '@mui/material';
import { React } from 'react';
import { formatDate } from '../utils/UtilsFuctions.js';



export default function HerbInput({ userLoc, herbData, stateFunction }) {

    //TODO: Validation before submit: check that both input fields are populated.

    function handleSubmit(event){
        event.preventDefault();
        let herbName;
        let herbNote;
        let location = userLoc;
        let foundDate;
        for (const target of event.target) {
           if (target.id === 'hname'){
            herbName = target.value;
           }
           else if (target.id === 'notes'){
            herbNote = target.value;
           }
        }
        foundDate = formatDate(new Date());
        const herbInput =  {"name": herbName, "lat": location.latitude.toString(), "lng": location.longitude.toString(), "date": foundDate, "note": herbNote };
        const herbJSON = JSON.stringify(herbInput);
        console.log(herbJSON);
        stateFunction(herbJSON);
    }

    return (
        <div style={{ height: '25vh', width: '50%' }}>
            <APIProvider apiKey={getGoogleMapsAPIKey()} onLoad={() => console.log('Maps API has loaded.')}>
                <Map
                    mapId={getGoogleMapsMapId()}
                    defaultZoom={15}
                    defaultCenter={{ lat: userLoc.latitude, lng: userLoc.longitude }}>
                    <AdvancedMarker position={{ lat: userLoc.latitude, lng: userLoc.longitude }} />
                </Map>
            </APIProvider>
            <form onSubmit={handleSubmit}>
            <Autocomplete
                disablePortal
                id="hname"
                options={herbData}
                getOptionLabel={(herb) => herb.name}
                sx={{ width: 300 }}
                renderInput={(params) => <TextField {...params} label="Herb Sighted" />} />
                <TextField id="notes" label="Notes" multiline />
                <Button variant="text" type="submit">Submit</Button>
                </form>
        </div>

    );
}