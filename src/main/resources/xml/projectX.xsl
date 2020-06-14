<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></link>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
            </head>
            <body>
                <table class="table">
                    <tr>
                        <td >
                            <strong>Name</strong>
                        </td>
                        <td >
                            <strong>Sektor</strong>
                        </td>
                    </tr>
                    <xsl:for-each select="/DATA/ROW">
                        <tr>
                            <td >
                                <xsl:value-of select="name"/>
                            </td>
                            <td >
                                <xsl:value-of select="sector"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>