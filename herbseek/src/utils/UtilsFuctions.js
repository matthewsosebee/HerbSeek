export function calculateMiles(lat1, long1, lat2, long2){

    const distance = Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long2-long1))*3958.8

    return distance;
}

export function getGoogleMapsAPIKey(){
    return 'AIzaSyDxHUpolcv3ZiwQIzfWrRILdYlSdPsRTGY';
}

export function getGoogleMapsMapId(){
    return 'test4205aa9aad14907f';
}

export function formatDate(date){
    return date.toISOString().split('T')[0];
}