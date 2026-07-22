import React from 'react';

export function Scorebelow70({ players }) {
    let players70 = [];
    players.map((item) => {
        if(item.score <= 70) {
            players70.push(item);
        }
    });

    return (
        <ul>
            {players70.map((item, index) => (
                <li key={index}>Mr. {item.name} <span>{item.score}</span></li>
            ))}
        </ul>
    );
}
