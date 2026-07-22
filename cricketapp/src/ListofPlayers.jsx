import React from 'react';

export function ListofPlayers({ players }) {
    return (
        <ul>
            {players.map((item, index) => (
                <li key={index}>Mr. {item.name} <span>{item.score}</span></li>
            ))}
        </ul>
    );
}
