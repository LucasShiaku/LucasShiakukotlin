

fun main() {
    val listaDeTarefas = mutableListOf<String>()
    var continuar = true

    while (continuar) {
        println("Escolha uma opção:")
        println("1 - Adicionar tarefa")
        println("2 - Marcar tarefa como concluída")
        println("3 - Listar tarefas")
        println("4 - Sair")

        when (readLine()?.toIntOrNull()) {




            1 -> {
                println("Digite a nova tarefa:")
                val novaTarefa = readLine()
                if (novaTarefa != null) {
                    listaDeTarefas.add(novaTarefa)
                    println("Tarefa adicionada com sucesso!")
                }
            }





            2 -> {
                if (listaDeTarefas.isEmpty()) {
                    println("Não há tarefas para marcar como concluída.")
                } else {
                    println("Selecione o número da tarefa que deseja marcar como concluída:")
                    for ((index, tarefa) in listaDeTarefas.withIndex()) {
                        println("$index - $tarefa")
                    }
                    val indice = readLine()?.toIntOrNull()
                    if (indice != null && indice in 0 until listaDeTarefas.size) {
                        listaDeTarefas.removeAt(indice)
                        println("Tarefa marcada como concluída.")
                    } else {
                        println("Opção inválida.")
                    }
                }
            }




            3 -> {
                if (listaDeTarefas.isEmpty()) {
                    println("Não há tarefas cadastradas.")
                } else {
                    println("Lista de tarefas:")
                    for ((index, tarefa) in listaDeTarefas.withIndex()) {
                        println("$index - $tarefa")
                    }
                }
            }






            4 -> {
                continuar = false
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    }
}













