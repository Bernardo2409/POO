package aula07.Ex2;

class DateND extends DateYMD { 

    int counter = 0;
    public DateND(int day, int month, int year) {
        super(day, month, year); // Inicializa os valores na classe pai
    }
    
    public int compareDate(int day, int month, int year) {
        if (year > this.year) {
            return 1; // A data de input é maior
        } else if (year < this.year) {
            return -1; // A data de input é menor
        } else {
            // Se os anos forem iguais, comparar os meses
            if (month > this.month) {
                return 1; // A data de input é maior
            } else if (month < this.month) {
                return -1; // A data de input é menor
            } else {
                // Se os meses forem iguais, comparar os dias
                if (day > this.day) {
                    return 1; // A data de input é maior
                } else if (day < this.day) {
                    return -1; // A data de input é menor
                } else {
                    return 0; // As datas são iguais
                }
            }
        }
    }
    public int calculateDaysDifference(int day, int month, int year) {
        counter = 0; // Reinicia o contador
        while (compareDate(day, month, year) != 0) {
            if (compareDate(day, month, year) == -1) {
                increment(); // Incrementa a data armazenada
                counter++; // Incrementa o contador
            } else if (compareDate(day, month, year) == 1) {
                decrement(); // Decrementa a data armazenada
                counter++; // Incrementa o contador
            }
        }
        return counter; // Retorna a quantidade de dias de diferença
    }
    

    
}

// enquanto a data não é igual à data final, vai usando o counter