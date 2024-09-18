package question05;

public class Hand {
    private Card head;

    public Hand() {
        this.head = null;
    }

    // Adiciona uma nova carta à mão
    public void addCard(String rank, String suit) {
        Card newCard = new Card(rank, suit);

        if (head == null) {
            head = newCard;
        } else {
            Card current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newCard);
            newCard.setPrev(current);
        }
    }

    // Remove uma carta da mão pelo valor e naipe
    public void removeCard(String rank, String suit) {
        if (head == null) {
            System.out.println("A mão está vazia.");
            return;
        }

        Card current = head;
        while (current != null && !(current.getRank().equals(rank) && current.getSuit().equals(suit))) {
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Carta não encontrada.");
            return;
        }

        if (current.getPrev() != null) {
            current.getPrev().setNext(current.getNext());
        } else {
            head = current.getNext();
        }

        if (current.getNext() != null) {
            current.getNext().setPrev(current.getPrev());
        }
    }

    // Reorganiza a carta movendo-a para uma nova posição
    public void moveCard(String rank, String suit, int newPosition) {
        if (head == null) {
            System.out.println("A mão está vazia.");
            return;
        }

        Card current = head;
        Card cardToMove = null;
        int index = 0;

        while (current != null) {
            if (current.getRank().equals(rank) && current.getSuit().equals(suit)) {
                cardToMove = current;
                break;
            }
            current = current.getNext();
            index++;
        }

        if (cardToMove == null) {
            System.out.println("Carta não encontrada.");
            return;
        }

        // Remove a carta da posição atual
        if (cardToMove.getPrev() != null) {
            cardToMove.getPrev().setNext(cardToMove.getNext());
        } else {
            head = cardToMove.getNext();
        }

        if (cardToMove.getNext() != null) {
            cardToMove.getNext().setPrev(cardToMove.getPrev());
        }

        // Insere a carta na nova posição
        current = head;
        index = 0;

        if (newPosition == 0) {
            cardToMove.setNext(head);
            cardToMove.setPrev(null);
            if (head != null) {
                head.setPrev(cardToMove);
            }
            head = cardToMove;
        } else {
            while (current != null && index < newPosition - 1) {
                current = current.getNext();
                index++;
            }

            if (current != null) {
                cardToMove.setNext(current.getNext());
                cardToMove.setPrev(current);
                if (current.getNext() != null) {
                    current.getNext().setPrev(cardToMove);
                }
                current.setNext(cardToMove);
            } else {
                System.out.println("Posição inválida.");
            }
        }
    }

    // Exibe todas as cartas na mão
    public void displayHand() {
        if (head == null) {
            System.out.println("A mão está vazia.");
            return;
        }

        Card current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
