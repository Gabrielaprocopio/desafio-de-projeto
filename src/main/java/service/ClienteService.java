package service;

import one.dio.gof.model.Cliente;

public interface ClienteService {
    ThreadLocal<Iterable<Cliente>> buscarTodos = new ThreadLocal<Iterable<Cliente>>()

    {
        Cliente buscarPorId(Long id) {
            return null;
        }

        void inserir(Cliente cliente) {

        }

        void atualizar(Long id, Cliente cliente) {

        }

        void deletar(Long id) {

        }
    };

    Iterable<Cliente> buscarTodos();

    abstract Cliente buscarPorId();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
