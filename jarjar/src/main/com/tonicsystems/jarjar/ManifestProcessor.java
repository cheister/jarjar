/*
  Jar Jar Links - A utility to repackage and embed Java libraries
  Copyright (C) 2004  Tonic Systems, Inc.

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; see the file COPYING.  if not, write to
  the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA 02111-1307 USA
*/

package com.tonicsystems.jarjar;

import java.io.IOException;
import java.util.*;

class ManifestProcessor implements JarProcessor
{
    private static final String MANIFEST_PATH = "META-INF/MANIFEST.MF";
    private static final ManifestProcessor INSTANCE = new ManifestProcessor();

    public static ManifestProcessor getInstance() {
        return INSTANCE;
    }
    
    private ManifestProcessor() {
    }

    public boolean process(EntryStruct struct) throws IOException {
        if (struct.file != null && struct.name.equalsIgnoreCase(MANIFEST_PATH))
            return false;
        return true;
    }
}
    