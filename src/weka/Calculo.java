/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weka;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
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
    private String motivacao;
    private ArrayList<Calculo> lista = new ArrayList();

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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMoraemitap() {
        return moraemitap;
    }

    public void setMoraemitap(String moraemitap) {
        this.moraemitap = moraemitap;
    }

    public String getTrabalha() {
        return trabalha;
    }

    public void setTrabalha(String trabalha) {
        this.trabalha = trabalha;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public String getFilhos() {
        return filhos;
    }

    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    public String getCota() {
        return cota;
    }

    public void setCota(String cota) {
        this.cota = cota;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public String getTempochegar() {
        return tempochegar;
    }

    public void setTempochegar(String tempochegar) {
        this.tempochegar = tempochegar;
    }

    public String getDependencias() {
        return dependencias;
    }

    public void setDependencias(String dependencias) {
        this.dependencias = dependencias;
    }

    public String getPerdeu() {
        return perdeu;
    }

    public void setPerdeu(String perdeu) {
        this.perdeu = perdeu;
    }

    public String getAfinidade() {
        return afinidade;
    }

    public void setAfinidade(String afinidade) {
        this.afinidade = afinidade;
    }

    public ArrayList<Calculo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Calculo> lista) {
        this.lista = lista;
    }

    public String getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(String motivacao) {
        this.motivacao = motivacao;
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
        System.out.println(probabilidade.length);
        double maior = 0;
        int posicao = 0;
        for (int i = 0; i < probabilidade.length ; i++) {
            if (maior<probabilidade[i]){
                maior = probabilidade[i];
                posicao = i;
            }
        }
        setMotivacao(String.format(posicao +" com %1$.2f porcento",(maior*100)));                       
        
    }
    
}
