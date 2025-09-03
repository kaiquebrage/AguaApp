Algoritmo "ÁguApp"
//
//
// Descrição : Cálculo de Dimensionamento de agua fria predial
// Autor(a) : João Henrique ; Kaique Bragé
// Data atual : 09/10/2019
Var
area_jardim,con_construcao,taxa_emergencia, reserva_inf,
reserva_sup, reserva_incendio_sup,reserva_incendio,reserva: real
total_pessoas, consumo_diario, num_apartamentos,
num_pavimentos,lavanderia,total_lavanderia, num_pessoas,
num_carros,roupas, num_lavanderia: inteiro
Inicio
roupas<-80
escreval ("Dimensionamento de reservatório de Água fria predial")
escreval("No total, incluindo empregado(a), quantas pessoas podem
morar no apartamento?" )
leia(num_pessoas)
escreval("Há quantos apartamentos por andar?")
leia(num_apartamentos)
escreval("A construção tem quantos andares?")
leia(num_pavimentos)
total_pessoas<- (num_pessoas*num_apartamentos*num_pavimentos)
escreval ("Entre com o total de vagas disponíveis de carros na
garagem:")
8
leia (num_carros)
escreval ("Entre com a área total dísponível do jardim em m²")
leia (area_jardim)
escreval ("Existem lavanderias na construção? 1- Sim, 0-Não")
leia (lavanderia)
se lavanderia=1 entao
escreval("Entre com o n° de lavanderias existentes na construção:")
leia (num_lavanderia)
senao
se lavanderia= 0 entao
lavanderia<-0
fimse
fimse
consumo_diario<- 200
total_lavanderia<- lavanderia*num_lavanderia
con_construcao<-
(consumo_diario*total_pessoas)+(num_carros*50)+(area_jardim*1.5)+(
total_lavanderia*80)
taxa_emergencia<-con_construcao*2
reserva<-taxa_emergencia*0.2
reserva_inf<- (taxa_emergencia*0.6)
reserva_sup<- (taxa_emergencia*0.4)+reserva
escreval("O consumo de água da construção é de: ",taxa_emergencia,"
litros")
escreval("O volume total de água do Resevatório Inferior é:
",reserva_inf," litros")
escreval("O volume total de água do Resevatório Superior com Reserva
de Incêndio é de:",reserva_sup," litros")
fimalgoritmo