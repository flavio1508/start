import React from "react";
import { InternalSymbolName } from "typescript";
import { ITarefa } from "../../types/ITarefa";
import Item from './Item';
import EstiloLista from "./Lista.module.scss";

interface props{
    tarefas:ITarefa[],
    selecionarTarefa(tarefaSelecionada:ITarefa):void,
    ativo:boolean|undefined
}

function Lista({ativo,tarefas, selecionarTarefa}: props){ 
    return( 
   <aside className={EstiloLista.listaTarefas}>
        <h2 >Estudo do dia</h2> 
        <ul> 
            {tarefas.map((item)=> ( 
            <Item 
            key={item.id} 
            item={item} 
            selecionarTarefa={selecionarTarefa}
            ativo = {ativo}
           />))}
        </ul>
    </aside>
    );
} 

export default Lista;