import { useState } from "react";
import Cronometro from "../componentes/Cronometro";
import Formulario from "../componentes/Formulario";
import Lista from "../componentes/Lista";
import { ITarefa } from "../types/ITarefa";
import EstiloApp from './App.module.scss';


function App() {
  const [tarefas, setTarefas] = useState<ITarefa[]>([]);
  const [selecionado, setSelecionado] = useState<ITarefa>();
  function selecionarTarefa(tarefaSelecionado: ITarefa) {
    setSelecionado(tarefaSelecionado);
    setTarefas(tarefasAnteriores=>tarefasAnteriores.map(tarefa =>({
      ...tarefa,
      selecionado:tarefa.id === tarefaSelecionado.id
    })));
  };
  return (
    <div className={EstiloApp.AppStyle}>
      <Formulario setTarefas={setTarefas} />
      <Cronometro />
      <Lista
        tarefas={tarefas} 
        selecionarTarefa={selecionarTarefa}
        />
    </div>
  );
}

export default App;
