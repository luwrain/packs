/*
   Copyright 2012-2021 Michael Pozhidaev <msp@luwrain.org>

   This file is part of LUWRAIN.

   LUWRAIN is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   LUWRAIN is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.packs;

import java.io.*;
import java.net.*;

import org.luwrain.core.*;

public final class IndexFetching
{
    static public final String INDEX_URL = "http://download.luwrain.org/packs/index.xml";

    Index fetch() throws IOException
    {
	final URL url = new URL(INDEX_URL);
	final InputStream is = url.openStream();
	try {
	    final BufferedReader r = new BufferedReader(new InputStreamReader(is));
	    String line = r.readLine();
	    while (line != null)
	    {
		line = r.readLine();
	    }
	}
	finally {
	    is.close();
	}
	return new Index();
    }
}
