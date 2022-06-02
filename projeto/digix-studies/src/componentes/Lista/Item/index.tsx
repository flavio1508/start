import { ITarefa } from '../../../types/ITarefa';
import EstiloItem from'./Item.module.scss';

interface props {
    item:ITarefa,
    selecionarTarefa(tarefaSelecionada:ITarefa): void,
    ativo:boolean|undefined
}
export default function Item( {ativo,item, selecionarTarefa}: props){
       return(
           <li className={`${EstiloItem.item} ${item.selecionado ? EstiloItem.itemSelecionado: ''} ${item.completado ? EstiloItem.itemCompletado: ''}`}
           onClick={()=>!ativo && !item.completado && selecionarTarefa(item)}>

               <h3>{item.tarefa}</h3> 
               <span>{item.tempo}</span> 
               {item.completado && <span className={EstiloItem.concluido} aria-label="tarefa completada"></span>}
           </li>
       )
    }
    
