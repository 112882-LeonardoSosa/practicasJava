package dominio;


public class Monitor extends ObjetoInteligente {
    
    private int limiteSup;
    private int limiteInf;
    
    public Monitor(){
        super();
        limiteSup = 0;
        limiteInf = 0;       
    }

    public Monitor(int limiteSup, int limiteInf, int id, int estado, String nombre) {
        super(id, estado, nombre);
        this.limiteSup = limiteSup;
        this.limiteInf = limiteInf;
    }

    public int getLimiteSup() {
        return limiteSup;
    }

    public void setLimiteSup(int limiteSup) {
        this.limiteSup = limiteSup;
    }

    public int getLimiteInf() {
        return limiteInf;
    }

    public void setLimiteInf(int limiteInf) {
        this.limiteInf = limiteInf;
    }
    
    @Override
    public void tomarComando(int valor){
        int tipo, hora;
        String desc = "Alarma";
        if (valor < limiteInf || valor > limiteSup) {
            if (Math.random()>0.5) {
                tipo = 1;
            }
            else
                tipo = 2;
            
            hora = (int)(Math.random()*2400);
            desc+=hora;
            
            generarAlarma(new Alarma(tipo,hora,desc));
        }
    }
    
}
