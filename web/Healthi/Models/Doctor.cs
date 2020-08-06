using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Healthi.Models
{
    public class Doctor
    {
        public String  FirstName {get; set;}

        public String LastName { get; set; }

        public int Phone { get; set; }

        public bool? isAuthorized { get; set; }
    }
}
