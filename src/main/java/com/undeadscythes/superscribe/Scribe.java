/*
 * Copyright (C) 2014 UndeadScythes <udscythes@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.undeadscythes.superscribe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Scribe {
    public static void write(File file, String text) throws IOException {
        new BufferedWriter(new FileWriter(file)).write(text);
    }
    
    public static String read(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String text = "";
        String nextLine;
        while((nextLine = reader.readLine()) != null) {
            text += nextLine + System.lineSeparator();
        }
        return text;
    }
    
    private Scribe() {}
}
