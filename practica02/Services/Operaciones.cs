using System;
using WSDL.mensajes;

namespace WSDL.operaciones
{
    public class Operaciones : Mensajes
    {
        public string Saludar(string nombre)
        {
            string msj = "hola "+nombre;
            return msj;
        }
        public string Mostrar(int id)
        {
            return personNames[id];
        }
    }
}
