# AdRegistration
## Como compilar e executar:<br />
Para executar o programa baixe o repositorio clicando em CODE e Download ZIP, e descompacte para o seu workspace, abra-o na sua IDE e execute normalmente.<br />
Ou caso tenha problemas com isso, de forma alternativa voce pode criar um projeto com um package chamado "entities" com as seguintes classes: <br />
  SistemaCadastro <br />
  Anuncio <br />
  Calculadora <br /> 
  Dados <br />
Após isso apensa copie e cole o codigo das classes do repositório nas respectivas classes da sua IDE

## Descrição do projeto
O projeto tem como objetivo criar um programa capaz de cadastrar anúncios e garda-los em uma ArrayList para que possam ser usados em um futuro projeto, ou futuros commits.
O usuário informa 
<img>
nome do anúncio<br />
cliente<br />
data de início<br />
data de término<br />
investimento por dia<br />
<br />
E o programa retorna um relatorio que contem: 
valor total investido<br />
quantidade máxima de visualizações<br />
quantidade máxima de cliques<br />
quantidade máxima de compartilhamentos<br />
<br />
Os calculos dos relatórios são feiros baseados nas seguintes premissas <br />
a cada 100 pessoas que visualizam o anúncio 12 clicam nele. <br />
a cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais. <br />
cada compartilhamento nas redes sociais gera 40 novas visualizações. <br />
30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido. <br />
o mesmo anúncio é compartilhado no máximo 4 vezes em sequência
