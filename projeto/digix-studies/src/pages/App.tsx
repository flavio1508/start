import { useState } from "react";
import Cronometro from "../componentes/Cronometro";
import Formulario from "../componentes/Formulario"; 
import Lista from "../componentes/Lista"; 
import { ITarefa } from "../types/ITarefa";
import EstiloApp from './App.module.scss';


function App() { 
  const [tarefas,setTarefas] = useState<ITarefa[]>([]);
  return ( 
    <div className={EstiloApp.AppStyle}>
    <Formulario setTarefas={setTarefas}/> 
    <Cronometro/>
    <Lista tarefas={tarefas}/> 
    </div>
  );
}

export default App;
