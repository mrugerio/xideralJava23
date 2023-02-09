export type AcademyFormData = {
    email: string;
    name: string;
    phone: string;
    githubUrl: string;
    career: string;
    role: 0 | string ;
    roleOther: string;
    skills: string;
    englishLevel: number;
    otherLanguages: string;
    stateCity: string;
};

export type AcademyFormDataRetrieve = {
    id: number;
    email: string;
    name: string;
    phone: string;
    githubUrl: string;
    career: string;
    role: string;
    roleOther: string;
    skills: string;
    englishLevel: number;
    otherLanguages: string;
    stateCity: string;
};


export type LocationData = {
    ip: string;
    network: string;
    version: string;
    city: string;
    region: string;
    region_code: string;
    country: string;
    country_name: string;
    country_code: string;
    country_code_iso3: string;
    country_capital: string;
    country_tld: string;
    continent_code: string;
    in_eu: boolean;
    postal: string;
    latitude: number;
    longitude: number;
    timezone: string;
    utc_offset: string;
    country_calling_code: string;
    currency: string;
    currency_name: string;
    languages: string;
    country_area: number;
    country_population: number;
    asn: string;
    org: string;
};
