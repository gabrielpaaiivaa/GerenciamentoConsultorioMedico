# Permitir que o paciente tenha um plano de saúde ou seja particular.Isso pode afetar as regras do agendamento.

# Criar um Sistema de Relatórios
# Número total de consultas no mês → Método que retorna a quantidade de consultas agendadas em determinado período.
# Ranking de médicos mais requisitados → Mostrar quais médicos têm mais consultas marcadas.
# Lista de consultas canceladas → Criar um log para armazenar consultas canceladas e permitir visualização posterior.

    Criar Regras Mais Avançadas
   Intervalo mínimo entre consultas → Evitar que um médico tenha duas consultas seguidas sem tempo de descanso.
   Limite diário de consultas por médico → Impedir que um médico atenda mais que X pacientes por dia.
   Cadastro de funcionários → Criar uma classe Funcionario que poderia incluir recepcionistas responsáveis pelo agendamento.

7. Persistência de Dados
   No momento, tudo está armazenado em memória.

Usar arquivos CSV ou JSON para salvar e carregar consultas.
Integrar com um banco de dados SQLite ou MySQL, permitindo que os dados sejam persistentes.