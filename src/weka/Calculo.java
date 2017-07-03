/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weka;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Ogarcia
 */
public class Calculo {
    private String periodo;
    private String idade;
    private String sexo;
    private String moraemitap;
    private String trabalha;
    private String casado;
    private String filhos;
    private String origem;
    private String ingresso;
    private String cota;
    private String locomocao;
    private String tempochegar;
    private String dependencias;
    private String perdeu;
    private String afinidade;   

    public Calculo(String periodo, String idade, String sexo, String moraemitap,
            String trabalha, String casado, String filhos, String origem, String ingresso, 
            String cota, String locomocao, String tempochegar, String dependencias, 
            String perdeu, String afinidade) {
        this.periodo = periodo;
        this.idade = idade;
        this.sexo = sexo;
        this.moraemitap = moraemitap;
        this.trabalha = trabalha;
        this.casado = casado;
        this.filhos = filhos;
        this.origem = origem;
        this.ingresso = ingresso;
        this.cota = cota;
        this.locomocao = locomocao;
        this.tempochegar = tempochegar;
        this.dependencias = dependencias;
        this.perdeu = perdeu;
        this.afinidade = afinidade;        
    }
    
    public Calculo(){
        
    }
    
    public void importarArquivo() throws Exception{
        DataSource ds = new DataSource("src/weka/Respostas-28-07.arff");
        Instances ins = ds.getDataSet();
        ins.setClassIndex(15);
        
        NaiveBayes nb = new NaiveBayes();
        nb.buildClassifier(ins);
        Instance novo = new DenseInstance(16);
        novo.setDataset(ins);         
        novo.setValue(0, periodo);
        novo.setValue(1, idade);
        novo.setValue(2, sexo);
        novo.setValue(3, moraemitap);
        novo.setValue(4, trabalha);
        novo.setValue(5, casado);
        novo.setValue(6, filhos);
        novo.setValue(7, origem);
        novo.setValue(8, ingresso);
        novo.setValue(9, cota);
        novo.setValue(10, locomocao);
        novo.setValue(11, tempochegar);
        novo.setValue(12, dependencias);
        novo.setValue(13, perdeu);
        novo.setValue(14, afinidade);        
        double probabilidade[] = nb.distributionForInstance(novo);
        System.out.println("Motivação");
        System.out.println(String.format("1 : %1$.2f",(probabilidade[0]*100)));
        System.out.println(String.format("2 : %1$.2f",(probabilidade[1]*100)));
        System.out.println(String.format("3 : %1$.2f",(probabilidade[2]*100)));
        System.out.println(String.format("4 : %1$.2f",(probabilidade[3]*100)));
        System.out.println(String.format("5 : %1$.2f",(probabilidade[4]*100)));
        System.out.println(String.format("6 : %1$.2f",(probabilidade[5]*100)));
        System.out.println(String.format("7 : %1$.2f",(probabilidade[6]*100)));
        System.out.println(String.format("8 : %1$.2f",(probabilidade[7]*100)));
        System.out.println(String.format("9 : %1$.2f",(probabilidade[8]*100)));
        System.out.println(String.format("10 : %1$.2f",(probabilidade[9]*100)));        
        
    }
    
}
