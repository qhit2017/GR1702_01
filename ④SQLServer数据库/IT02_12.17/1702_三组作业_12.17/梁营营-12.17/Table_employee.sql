USE [db_employee]
GO
/****** Object:  Table [dbo].[Table_employee]    Script Date: 12/15/2017 11:41:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_employee](
	[id] [tinyint] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[salary] [money] NOT NULL,
	[dateline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
 CONSTRAINT [PK_Table_employee] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
