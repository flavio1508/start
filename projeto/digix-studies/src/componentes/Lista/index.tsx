import React, { useState } from "react"; 
import EstiloLista from "./Lista.module.scss"; 
import Item from './Item';
import { ITarefa } from "../../types/ITarefa";

function Lista({tarefas}:{tarefas:ITarefa[]}){ 
    return( 
   <aside className={EstiloLista.listaTarefas}>
        <h2 >Estudo do dia</h2> 
        <ul> 
            {tarefas.map((item,index)=> ( 
            <Item 
            key={index} 
            tarefa={item.tarefa}
            tempo={item.tempo}/>))}
        </ul>
    </aside>
    );
} 

export default Lista;