## Herança
Relação: A classe Pessoa é a base para Paciente e Medico

Imagine que todos nós temos algumas coisas em comum, como nome e idade. A classe Pessoa é como um modelo que guarda essas informações básicas. Tanto os pacientes quanto os médicos são tipos de pessoas, então eles herdam essas características da classe Pessoa. Isso ajuda a evitar repetir as mesmas informações em dois lugares diferentes. Assim, se precisarmos mudar algo sobre como armazenamos o nome ou a idade, fazemos isso uma única vez na classe Pessoa.

## Agregação

Relação: A classe Paciente tem uma relação de agregação com a classe Consulta. vai ter um paciente e suas consultas. Um paciente pode ter várias consultas ao longo do tempo, mas essas consultas podem existir mesmo que o paciente não esteja ativo no sistema. Por exemplo, se você já foi ao médico várias vezes, mesmo que não esteja indo agora, suas consultas ainda são registradas. Isso é a agregação: o paciente "possui" consultas, mas elas podem viver por conta própria.

## Composição

Relação: A classe Consulta tem uma relação de composição com as classes Paciente e Medico.
Quando falamos de uma consulta, ela não faz sentido sem um paciente e um médico. Se você marcar uma consulta, precisa saber quem é o médico que vai atendê-lo e quem é o paciente . Se a consulta for cancelada ou excluída, não faz sentido manter essa ligação com o médico ou o paciente. Então, essa relação é de composição: a consulta depende totalmente do paciente e do médico para existir.

## Resumo das Relações
  Herança: A classe Pessoa é como a "família" dos pacientes e médicos. Todos compartilham algumas características básicas.
  Agregação: Um paciente pode ter várias consultas ao longo do tempo; as consultas podem existir mesmo sem o paciente estar ativo.
  Composição: Uma consulta só faz sentido se houver um paciente e um médico envolvidos; se a consulta for cancelada, tudo relacionado a ela também desaparece.


## Integrados do Grupo
- Ana Beatriz
- Beatriz Vitória
- Rickson
