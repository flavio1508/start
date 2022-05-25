import Botao from "../Botao";
import Relogio from "./Relogio"; 
import  Style  from "./Cronometro.module.scss";
import { tempoParaSegundos } from "../../Commom/utils/date";
export default function Cronometro() {
    console.log('conversao', tempoParaSegundos('1:00:00'));
    return (
        <>
            <div className={Style.cronometro}>
                <p className={Style.titulo}>Escolha um card e inicie o cronometro</p>
                <div className={Style.relogioWrapper}>
                    <Relogio />
                </div>
                <Botao>
                    Iniciar
                </Botao>
            </div>
        </>
    );
}