grammar JSONtoXML;

file    :   object EOF;

object  :   '{' property  (',' property)* '}';

property:   key ':' value;

key     :   string ;

value   :   number
        |   bool
        |   string
        |   object
        |   '[' (object (','object)*)? ']'
        |   NULL
        ;

string  :   StringCharacters?;
bool    :   TRUE | FALSE;
number  :   intt | doublee;
doublee :   intt '.' intt;
intt    :   DIGITS;

TRUE    :   'true';
FALSE   :   'false';
NULL    :   'null';

StringCharacters    :  '"' StringCharacter+ '"';

fragment
StringCharacter     :   ~["\\];

CHARACTERS  :   [a-zA-Z]+;

DIGITS  :   [0-9]+;

WS      :   [ \n\r\t\u000C]+ -> skip;
