package de.hsc.sose.escaperoom.riddle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SymbolMatrix {

    private final char[][] matrix;

    public SymbolMatrix(char[][] characters) {
        this.matrix = characters;
    }

    /**
     * @return List with Characters of chosen row
     */
    public List<Character> getRow(final int rowIdx) {
        return new ArrayList<>(String.valueOf(matrix[rowIdx]).chars().mapToObj(c -> (char) c).toList());
    }

    private void setRow(final int rowIdx, final List<Character> row) {
        final var internalRow = matrix[rowIdx];
        for (int i = 0; i < row.size(); i++) internalRow[i] = row.get(i);
    }

    public void rotateRow(final int rowIdx, final int distance) {
        final var row = getRow(rowIdx);
        Collections.rotate(row, distance);
        setRow(rowIdx, row);
    }
    /**
     * @return List with Characters of chosen column
     */
    public List<Character> getColumn(final int index) {
        final var unmodifiableCharList = Arrays.stream(matrix).map(row -> row[index]).toList();
        return new ArrayList<>(unmodifiableCharList);
    }

    private void setColumn(final int index, final List<Character> column) {
        for (int i = 0; i < column.size(); i++) {
            matrix[i][index] = column.get(i);
        }
    }

    public void rotateColumn(final int columnNo, final int distance) {
        final var column = getColumn(columnNo);
        Collections.rotate(column, distance);
        setColumn(columnNo, column);
    }

    //checks whether solution is correct or not
    public boolean contains(String solution) {
        //checks row
        if (Arrays.stream(matrix)
                .map(String::valueOf)
                .anyMatch(row -> row.contains(solution))
        ) {
            return true;
        }

        //checks column
        for (var i = 0; i < matrix[0].length; i++) {
            final var column = getColumn(i).stream().map(String::valueOf).reduce("", String::concat);
            if (column.contains(solution)) {
                return true;
            }
        }
        return false;
    }

    //prints matrix
    @Override
    public String toString() {
        final var stringBuilder = new StringBuilder();
        Arrays.stream(matrix).map(String::valueOf).forEach(row -> stringBuilder.append(row).append("\n"));
        return stringBuilder.toString();
    }
}
