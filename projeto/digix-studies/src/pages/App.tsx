import { useState } from "react";
import Cronometro from "../componentes/Cronometro";
import Formulario from "../componentes/Formulario";
import Lista from "../componentes/Lista";
import { ITarefa } from "../types/ITarefa";
import EstiloApp from './App.module.scss';


function App() {
  const [tarefas, setTarefas] = useState<ITarefa[]>([]);
  const [selecionado, setSelecionado] = useState<ITarefa>();
  const[ativo,setAtivo]= useState<boolean>();
  function selecionarTarefa(tarefaSelecionado: ITarefa) {
    setSelecionado(tarefaSelecionado);
    setTarefas(tarefasAnteriores=>tarefasAnteriores.map(tarefa =>({
      ...tarefa,
      selecionado:tarefa.id === tarefaSelecionado.id
    })));
  }; 
  function finalizarTarefa(){
    if(selecionado){
      setTarefas(tarefasAnteriores => tarefasAnteriores.map(tarefa => {
        if(tarefa.id === selecionado.id){
          return{
            ...tarefa,
            selecionado:false,
            completado:true
          }
        } 
        return tarefa;
      }
      ))
    }
  }
  return (
    <div className={EstiloApp.AppStyle}>
      <Formulario setTarefas={setTarefas} />
      <Cronometro finalizarTarefa={finalizarTarefa} selecionado={selecionado} setAtivo={setAtivo} />
      <Lista
        tarefas={tarefas} 
        selecionarTarefa={selecionarTarefa} 
        ativo = {ativo}
        />
    </div>
  );
}

export default App;
