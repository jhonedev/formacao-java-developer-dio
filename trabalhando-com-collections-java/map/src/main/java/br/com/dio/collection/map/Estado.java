package br.com.dio.collection.map;

import java.util.Objects;

public class Estado {
    private Integer populacao;

    public Estado(Integer populacao) {
        this.populacao = populacao;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(populacao, estado.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(populacao);
    }

    @Override
    public String toString() {
        return "Estado{" +
                "populacao=" + populacao +
                '}';
    }
}
