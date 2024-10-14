export default function HerbItem({name, lat, lng, date}){
    return (
        <li>
        <h1>{name}</h1>
        <h2>{lat}, {lng}</h2>
        <h3>{date}</h3>
        </li>
    );
}