import React from "react";
import { InternalSymbolName } from "typescript";
import { ITarefa } from "../../types/ITarefa";
import Item from './Item';
import EstiloLista from "./Lista.module.scss";

interface props{
    tarefas:ITarefa[],
    selecionarTarefa(tarefaSelecionada:ITarefa):void
}

function Lista({tarefas, selecionarTarefa}: props){ 
    return( 
   <aside className={EstiloLista.listaTarefas}>
        <h2 >Estudo do dia</h2> 
        <ul> 
            {tarefas.map((item,index)=> ( 
            <Item 
            key={item.id} 
            item={item} 
            selecionarTarefa={selecionarTarefa}
           />))}
        </ul>
    </aside>
    );
} 

export default Lista;