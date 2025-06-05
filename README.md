# Cosenza RollTheDice

Applicazione Android che simula il lancio di un dado.
Genera un numero casuale tra 1 e 6, mostra la faccia del dado corrispondente e comunica all’utente se ha vinto (numero pari) o perso (numero dispari).

## Linguaggi e strumenti usati

- **Kotlin**
- **Android SDK**
- Intent e passaggio di dati tra Activity
- Animazioni (fade in/out)

---

## Funzionalità

- Generazione di un numero casuale da 1 a 6
- Visualizzazione grafica del dado
- Messaggio di vittoria o sconfitta:
  - Numeri **pari** = vittoria 🎉
  - Numeri **dispari** = sconfitta 😢
- Navigazione tra le activity
- Transizioni animate tra schermate
- Pulsante per tornare alla home

---

## Struttura dell'app

| Activity        | Descrizione |
|----------------|-------------|
| **MainActivity**    | Punto di partenza: bottone per lanciare il dado |
| **SecondActivity**  | Mostra la faccia del dado e il numero estratto |
| **ResultActivity**  | Comunica il risultato (pari/dispari) e fornisce un bottone per tornare alla home |

---

## UI Design

- Adattata per dispositivi mobili
- Layout responsive con `ConstraintLayout`
- Animazioni di transizione (`fade_in` / `fade_out`)

---

## Come usarlo

1. Clona la repository:
   ```bash
   git clone https://github.com/tuo-username/Cosenza_RollTheDice.git
