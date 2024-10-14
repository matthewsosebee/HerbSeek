import HerbItem from "./HerbItem";


export default function HerbList({herbData}){

    let data = herbData;

    const herbList = data.map((herb) => <HerbItem key={herb.id} name={herb.name} lat={herb.lat} lng={herb.lng} date={herb.date}/>);

    return (
        <ul>
        {herbList}
        </ul>
    );
}